class Retangulo {

  public int lado, altura;

  public Retangulo (int lado, int altura){
    this.lado = lado;
    this.altura = altura;
  }

  public int area (){
    return this.lado * this.altura;
  }

  public int perimetro (){
    return 2 * this.lado + 2 * this.altura;
  }
}
