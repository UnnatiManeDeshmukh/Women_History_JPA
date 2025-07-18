package women_services;

import women_dao.WomenDAO;
import women_entity.WomenEntity;

	import java.util.List;

	public class WomenServices {

	    private WomenDAO dao;

	    public WomenServices() {
	        this.dao = new WomenDAO(); // You could inject this via constructor too
	    }

	    // 👉 Insert a new record
	    public void addWoman(String name, int birthYear, String country, String contribution) {
	        // 💡 You can add validations or preprocessing here
	        if (name == null || name.isBlank()) {
	            throw new IllegalArgumentException("Name cannot be empty.");
	        }
	        if (contribution == null || contribution.isBlank()) {
	            throw new IllegalArgumentException("Contribution cannot be empty.");
	        }
	        WomenEntity entity = new WomenEntity(name, birthYear, country, contribution);
	        dao.insert(entity);
	        System.out.println("✅ Woman inserted successfully!");
	    }

	    // 👉 Fetch all
	    public List<WomenEntity> fetchAllWomen() {
	        return dao.getAll();
	    }

	    // 👉 Update contribution
	    public void updateContribution(int id, String newContribution) {
	        if (newContribution == null || newContribution.isBlank()) {
	            throw new IllegalArgumentException("Contribution cannot be empty.");
	        }
	        dao.update(id, newContribution);
	        System.out.println("✅ Updated successfully!");
	    }

	    // 👉 Delete
	    public void deleteWoman(int id) {
	        dao.delete(id);
	        System.out.println("✅ Deleted successfully!");
	    }
	}
