package com.test;

import com.cj.dao.StudentDao;
import com.cj.domain.Student;
import com.cj.utils.SqlSessionUtil;

import java.util.List;
import java.util.Map;

public class main02 {
    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionUtil.getSqlSession().getMapper(StudentDao.class);
        /*Student s = studentDao.select1("001");
        System.out.println(s);*/

        /*
           使用Map集合进行传递或者使用domain类进行传递
           将参数进行封装（key必须相同）
        Map<String,String> map =new HashMap<>();
        map.put("id","001");
        map.put("name","张三");
        Student s = studentDao.select2(map);
        System.out.println(s);
        */
        /*
            返回值以Map类型
        List<Map<String, Object>> list = studentDao.select3();
        for (Map map : list) {
            System.out.println(map);
        }
        */
        /*
            使用${}拼接符进行传递变量
        Student s = studentDao.select4("001");
        System.out.println(s);
        */
        /*
            模糊查询(使用${})

        List<Map<String, Object>> list= studentDao.select5("0");
        for (Map map : list) {
            System.out.println(map);
        }
            使用#{}
        List<Map<String, Object>> list= studentDao.select6("0");
        for (Map map : list) {
            System.out.println(map);
        }
        */
        /*List<Student> list= studentDao.select7();
        for (Student s : list) {
            System.out.println(s);
        }*/
        List<Student> list= studentDao.select8();
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
