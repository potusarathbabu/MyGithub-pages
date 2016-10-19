
package psb.colloboration.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import psb.colloboration.model.Forum;
import psb.colloboration.model.User;



@Repository("forumDAO")
public class ForumDAOImpl implements ForumDAO {
	

	
	@Autowired
	private SessionFactory sessionFactory;   
	
	public ForumDAOImpl(){}
	
	public ForumDAOImpl(SessionFactory sf){
		this.sessionFactory=sf;
	}
//	@Override
	public void createForum(Forum f) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.getCurrentSession();
		Transaction t=s.beginTransaction();
		System.out.println("Forum dao impl" +  f);
		s.saveOrUpdate(f);
		t.commit();	

	}

//	@Override
	public List<Forum> getForumList() {
		// TODO Auto-generated method stub
		List<Forum> lst;
		System.out.println("getAllForums()");
		Session ses = sessionFactory.openSession();
		System.out.println("getForumList()session " + ses.isOpen());
		Query qry = ses.createQuery("from Forum where status='valid'");
		lst = qry.list();
		System.out.println(lst);
		return lst;			
	}

	public Forum getForumid(int postid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteForum(Forum f) {
		// TODO Auto-generated method stub
		
	}

}
