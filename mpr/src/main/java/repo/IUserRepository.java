package repo;

import java.util.List;

import domain.*;

public interface IUserRepository extends IRepository<User>{
	public List<User> withLogin(String login, String password);
	public List<User> setupPermissions(User user);



}
