package Orientação_a_Objetos2.Classes;

abstract class Animal {
        private String nome;
        private int idade;
        private String especie;
        private String raca;



        public void setNome(String valor){
            this.nome = valor;
        }
        public String getNome(){
            return nome;
        }

        public void setIdade(int valor){
            this.idade = valor;
        }
        public int getIdade(){
            return idade;
        }

        public void setEspecie(String valor){
            this.especie = valor;
        }
        public String getEspecie(){
            return especie;
        }

        public void setRaca(String valor){
            this.raca = valor;
        }
        public String getRaca(){
            return raca;
        }

        public abstract void Comer();
       

        


}
