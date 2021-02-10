package xx.com;
// Generated Nov 20, 2019 6:43:35 PM by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped


public class Ott  implements java.io.Serializable {

private List<Ott>list= new ArrayList<>();
     private int id;
     private String name;
     private Integer password;
     private String email;

    public Ott() {
    }

	
    public Ott(int id) {
        this.id = id;
    }
    public Ott(int id, String name, Integer password, String email) {
       this.id = id;
       this.name = name;
       this.password = password;
       this.email = email;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPassword() {
        return this.password;
    }
    
    public void setPassword(Integer password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
     

public String doSave(){
    OttDao gg = new OttDao();
    gg.doSave(this);
return "success";
}

public String doUpd(){
    OttDao qq = new OttDao();
  qq.doup(this);
return "success";
}


public String doDel(){
    OttDao df = new OttDao();
   df.doDel(this);
return "success";
}







public List sow(){
OttDao t = new OttDao();

list=t.showall();
return list;
}
    public List<Ott> getList() {
        OttDao ww= new OttDao();
       list=ww.showall();
        return list;
    }

    public void setList(List<Ott> list) {
        this.list = list;
    }
    
    

public String search(){
OttDao ta = new OttDao();

ta.search(this);
return "search";
}
    
    
    

}


