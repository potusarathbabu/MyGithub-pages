package psb.colloboration.dao;

import java.util.List;

import psb.colloboration.model.Blog;

public interface BlogDAO {
	
    public Blog getCompleteBlog(int bid);
    
	public List<Blog> getBlogList();
	
	public void deleteBlog(Blog b);	
	
	public void createBlog(Blog b);
	

}
