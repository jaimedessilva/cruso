package banco.modelo;
/*
 * Classe Cliente do Banco
 * @Jaime de S
 * @Projeto Pós-Graduação
 */
public class Cliente {
	//Atributos
	protected int codigo;
	protected String cidade;
	protected String estado;
	//Incrementador
	private static int incremento;
	
	//Método Construtor com valores Dafault
	public Cliente(){
		incremento++;
		codigo = incremento++;
		cidade = "Brasilia";
		estado = "DF";
	}
	//Metodo construtor com parametros
	public Cliente (String cidade, String estado){
		this.cidade = cidade;
		this.estado = estado;
	}
	//Getter/Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	//Metodo Listar
	public String listarDados(){
		return "CODIGO:" + codigo + "\n"+
	           "CIDADE:" +cidade+ "\n"+
			   "ESTADO:" +estado;
	}
	public static int qtdClientes(){
		return incremento;
	}
}
