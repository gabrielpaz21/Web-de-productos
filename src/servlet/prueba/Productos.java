package servlet.prueba;

public class Productos {
	
	private String CODIGOARTICULO,SECCION,NOMBREARTICULO,IMPORTADO,PAISDEORIGEN;
	private double 	PRECIO;
	private String FECHA;
	
	public Productos(String c�DIGOART�CULO, String sECCI�N, String nOMBREART�CULO, double pRECIO, String fECHA, String iMPORTADO,
			String pA�SDEORIGEN) {

		CODIGOARTICULO = c�DIGOART�CULO;
		SECCION = sECCI�N;
		NOMBREARTICULO = nOMBREART�CULO;
		PRECIO = pRECIO;
		FECHA = fECHA;
		IMPORTADO = iMPORTADO;
		PAISDEORIGEN = pA�SDEORIGEN;
	}

	public Productos(String sECCI�N, String nOMBREART�CULO, double pRECIO,
			String fECHA,String iMPORTADO, String pA�SDEORIGEN) {
		
		SECCION = sECCI�N;
		NOMBREARTICULO = nOMBREART�CULO;
		PRECIO = pRECIO;
		FECHA = fECHA;
		IMPORTADO = iMPORTADO;
		PAISDEORIGEN = pA�SDEORIGEN;
		
	}

	public String getCODIGOARTICULO() {
		return CODIGOARTICULO;
	}

	public void setCODIGOARTICULO(String c�DIGOART�CULO) {
		CODIGOARTICULO = c�DIGOART�CULO;
	}

	public String getSECCION() {
		return SECCION;
	}

	public void setSECCION(String sECCI�N) {
		SECCION = sECCI�N;
	}

	public String getNOMBREARTICULO() {
		return NOMBREARTICULO;
	}

	public void setNOMBREARTICULO(String nOMBREART�CULO) {
		NOMBREARTICULO = nOMBREART�CULO;
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

	public void setPAISDEORIGEN(String pA�SDEORIGEN) {
		PAISDEORIGEN = pA�SDEORIGEN;
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
