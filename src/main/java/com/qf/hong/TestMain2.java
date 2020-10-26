package com.qf.hong;

import com.qf.hong.entity.Cate;
import com.qf.hong.entity.Product;
import com.qf.hong.mapper.CateMapper;
import com.qf.hong.mapper.ProductMapper;
import com.qf.hong.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.math.BigDecimal;
import java.util.List;

public class TestMain2 {
    public static void main(String[] args) {
        //创建工厂
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(
                TestMain2.class.getClassLoader().getResourceAsStream("mybatis-config.xml")
        );
        //默认提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //获取到mapper对象
        CateMapper cateMapper = sqlSession.getMapper(CateMapper.class);
        final ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
        //先进行主表的保存
        Cate cate = new Cate();
        cate.setName("华为");
         cateMapper.insert(cate);
        System.out.println(cate.getCateId());
        //其次到从表的保存
        for (int i = 0; i < 2; i++) {
            Product product = new Product();
            product.setTitle("华为标题"+i);
            product.setContent("华为内容"+i);
            product.setPrice(new BigDecimal(89999.00));
            product.setImg("../img/images/"+i);
            product.setCateId(cate.getCateId());
            productMapper.insert(product);
        }

        //查询主表
        List<Cate> cates = cateMapper.selectList();
        //遍历主表的同时查询从表
      /*  cates.forEach(cate1->{
            List<Product> products = productMapper.selectListByCateId(cate1.getCateId());
            cate1.setProductList(products);
        });
*/
        System.out.println(cate);
    }
}
