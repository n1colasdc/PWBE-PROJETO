import com.fasterxml.jackson.databind.ObjectMapper;

public class TesteJSON {

	public static void main(String[] args) {
		
		try {
			ObjectMapper objeto = new ObjectMapper();
			
			Pessoa pes = new Pessoa("Abel", 45);
			
			String json = objeto.writeValueAsString(pes);
			
			System.out.println("objeto serializado");
			
			System.out.println(json);
			
			Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			
			System.out.println("JSON desserializado para o obj Pessoa");
			
			System.out.println("Nome:" + desPessoa.getNome());

			System.out.println("Idade:" + desPessoa.getIdade());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
