private static void createRegistry(int hostport){
try{
LocateRegistry.createRegistry(hostport);
}catch(RemoteException e){
try{
LocateRegistry.getRegistry(hostport);
}catch(RemoteException err){
System.out.println("Error ... " + err.getMessage());
err.printStackTrace();
}
}
try{
System.out.println("Activating Java RmiRegistry.............");
java.lang.Thread.sleep(2000);
}catch(java.lang.InterruptedException err1){
System.out.println("Error... " + err1.getMessage());
err1.printStackTrace();
}