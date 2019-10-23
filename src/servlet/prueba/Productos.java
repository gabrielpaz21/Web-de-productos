package servlet.prueba;

public class Productos {
	
	private String CODIGOARTICULO,SECCION,NOMBREARTICULO,IMPORTADO,PAISDEORIGEN;
	private double 	PRECIO;
	private String FECHA;
	
	public Productos(String c”DIGOARTÕCULO, String sECCI”N, String nOMBREARTÕCULO, double pRECIO, String fECHA, String iMPORTADO,
			String pAÕSDEORIGEN) {

		CODIGOARTICULO = c”DIGOARTÕCULO;
		SECCION = sECCI”N;
		NOMBREARTICULO = nOMBREARTÕCULO;
		PRECIO = pRECIO;
		FECHA = fECHA;
		IMPORTADO = iMPORTADO;
		PAISDEORIGEN = pAÕSDEORIGEN;
	}

	public Productos(String sECCI”N, String nOMBREARTÕCULO, double pRECIO,
			String fECHA,String iMPORTADO, String pAÕSDEORIGEN) {
		
		SECCION = sECCI”N;
		NOMBREARTICULO = nOMBREARTÕCULO;
		PRECIO = pRECIO;
		FECHA = fECHA;
		IMPORTADO = iMPORTADO;
		PAISDEORIGEN = pAÕSDEORIGEN;
		
	}

	public String getCODIGOARTICULO() {
		return CODIGOARTICULO;
	}

	public void setCODIGOARTICULO(String c”DIGOARTÕCULO) {
		CODIGOARTICULO = c”DIGOARTÕCULO;
	}

	public String getSECCION() {
		return SECCION;
	}

	public void setSECCION(String sECCI”N) {
		SECCION = sECCI”N;
	}

	public String getNOMBREARTICULO() {
		return NOMBREARTICULO;
	}

	public void setNOMBREARTICULO(String nOMBREARTÕCULO) {
		NOMBREARTICULO = nOMBREARTÕCULO;
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

	public void setPAISDEORIGEN(String pAÕSDEORIGEN) {
		PAISDEORIGEN = pAÕSDEORIGEN;
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
