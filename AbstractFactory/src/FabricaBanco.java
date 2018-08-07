
public class FabricaBanco extends AbstractFactory{

	@Override
	public Oracle createBancoOracle(){
		return new BancoOracleImpl();
	}
	
	@Override
	public MySQL createBancoMySQL(){
		return new BancoMySQLImpl();
	}
}
