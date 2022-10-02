package site.metacoding.red.domain.users;

import java.util.List;

public interface UsersDao {
	public void inset(Users users);
	public List<Users> findAll();
	public Users findById(Integer id);
	public void deleteById(Integer id);
	public void update(Users users);
}
