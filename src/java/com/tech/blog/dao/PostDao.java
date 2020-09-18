
package com.tech.blog.dao;
import com.tech.blog.entities.Category;
import java.sql.*;
import java.util.ArrayList;
public class PostDao {
    
    Connection con;

    public PostDao(Connection con) {
        this.con = con;
    }
    // make a function that will fetch all the categories from database
    public  ArrayList<Category> getAllCategories()
    {
        ArrayList<Category> list=new ArrayList<>();
        try {
            String query="select * from categories";
            Statement st=con.createStatement();
            ResultSet set=st.executeQuery(query);
            while(set.next())
            {
                int cid=set.getInt("cid");
                String name=set.getString("name");
                String description=set.getString("description");
                Category c=new Category(cid, name, description);
                list.add(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
