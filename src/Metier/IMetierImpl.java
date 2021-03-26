package Metier;

import DAO.IDAO;

public class IMetierImpl implements IMetier{

	private IDAO dao;
	@Override
	public double Calcul() {
		double calcul=dao.getValue()*10;
		return calcul;
	}
	public IDAO getDao() {
		return dao;
	}
	public void setDao(IDAO dao) {
		this.dao = dao;
	}
	
	

}
