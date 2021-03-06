package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.PhieuThue;

public interface PhieuThueServices extends Remote{
	public void add(PhieuThue pt) throws RemoteException;
	public List<PhieuThue> getAllPhieuThue() throws RemoteException;
	public void removePhieuThue(int id) throws RemoteException;
	public void updatePhieuThue(PhieuThue pt) throws RemoteException;
	public List<PhieuThue> findPhieuThue(int id) throws RemoteException;
	public List<String> getTenBangDia() throws RemoteException;
	public List<PhieuThue> getPhieuThueByCMND(String cmnd) throws RemoteException;
	public List<String> getTenBangDiaByCMND(String cmnd) throws RemoteException;
}
