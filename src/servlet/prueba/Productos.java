package servlet.prueba;

public class Productos {
	
	private String CODIGOARTICULO,SECCION,NOMBREARTICULO,IMPORTADO,PAISDEORIGEN;
	private double 	PRECIO;
	private String FECHA;
	
	public Productos(String cÓDIGOARTÍCULO, String sECCIÓN, String nOMBREARTÍCULO, double pRECIO, String fECHA, String iMPORTADO,
			String pAÍSDEORIGEN) {

		CODIGOARTICULO = cÓDIGOARTÍCULO;
		SECCION = sECCIÓN;
		NOMBREARTICULO = nOMBREARTÍCULO;
		PRECIO = pRECIO;
		FECHA = fECHA;
		IMPORTADO = iMPORTADO;
		PAISDEORIGEN = pAÍSDEORIGEN;
	}

	public Productos(String sECCIÓN, String nOMBREARTÍCULO, double pRECIO,
			String fECHA,String iMPORTADO, String pAÍSDEORIGEN) {
		
		SECCION = sECCIÓN;
		NOMBREARTICULO = nOMBREARTÍCULO;
		PRECIO = pRECIO;
		FECHA = fECHA;
		IMPORTADO = iMPORTADO;
		PAISDEORIGEN = pAÍSDEORIGEN;
		
	}

	public String getCODIGOARTICULO() {
		return CODIGOARTICULO;
	}

	public void setCODIGOARTICULO(String cÓDIGOARTÍCULO) {
		CODIGOARTICULO = cÓDIGOARTÍCULO;
	}

	public String getSECCION() {
		return SECCION;
	}

	public void setSECCION(String sECCIÓN) {
		SECCION = sECCIÓN;
	}

	public String getNOMBREARTICULO() {
		return NOMBREARTICULO;
	}

	public void setNOMBREARTICULO(String nOMBREARTÍCULO) {
		NOMBREARTICULO = nOMBREARTÍCULO;
	}

	public String getIMPORTADO() {
		return IMPORTADO;
	}

	public void setIMPORTADO(String iMPORTADO) {
		IMPORTADO = iMPORTADO;
	}

	public String getPAISDEORIGEN() {
		return PAISDEORIGEN;
	}

	public void setPAISDEORIGEN(String pAÍSDEORIGEN) {
		PAISDEORIGEN = pAÍSDEORIGEN;
	}

	public double getPRECIO() {
		return PRECIO;
	}

	public void setPRECIO(double pRECIO) {
		PRECIO = pRECIO;
	}

	public String getFECHA() {
		return FECHA;
	}

	public void setFECHA(String fECHA) {
		FECHA = fECHA;
	}

	@Override
	public String toString() {
		return "Productos [CODIGOARTICULO=" + CODIGOARTICULO + ", SECCION=" + SECCION + ", NOMBREARTICULO="
				+ NOMBREARTICULO + ", IMPORTADO=" + IMPORTADO + ", PAISDEORIGEN=" + PAISDEORIGEN + ", PRECIO=" + PRECIO
				+ ", FECHA=" + FECHA + "]";
	}
	
}
