package psb.colloboration.dao;

import java.util.List;

import psb.colloboration.model.Forum;

public interface ForumDAO {

	public Forum getForumid(int postid);

	public List<Forum> getForumList();

	public void deleteForum(Forum f);

	public void createForum(Forum f);

	// public Forum getCompleteForum(int fid);
	// public void createForum(Forum f);

}
