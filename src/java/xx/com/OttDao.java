
package xx.com;


import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Dipty
 */
public class OttDao {
    public void doSave(Ott d){
        Session ss= NewHibernateUtil.getSessionFactory().openSession();
        ss.getTransaction().begin();
        ss.save(d);
        ss.getTransaction().commit();
        ss.close();

}
     public void doup(Ott ee){
        Session ss= NewHibernateUtil.getSessionFactory().openSession();
        ss.getTransaction().begin();
      ss.update(ee);
        ss.getTransaction().commit();
        ss.close();

}
     public void doDel(Ott aa){
        Session ss= NewHibernateUtil.getSessionFactory().openSession();
        ss.getTransaction().begin();
       ss.delete(aa);
        ss.getTransaction().commit();
        ss.close();

}
    
    
    
  public List<Ott> showall(){
  
  Session s=NewHibernateUtil.getSessionFactory().openSession();
  List<Ott> list = new  ArrayList<>();
  Query q = s.createQuery("from Ott");
  list=q.list();
  s.close();
  return list;
  
  }
  
  
  
  
   
    
  public List<Ott> search(Ott p){
  
  Session sm=NewHibernateUtil.getSessionFactory().openSession();
  List<Ott> list = new  ArrayList<>();
  Query q = sm.createQuery("from Ott where name='"+p.getEmail()+"'");
  list=q.list();
  sm.close();
  return list;
  
  }
  
  
  
  
  
}
