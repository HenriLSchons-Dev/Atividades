/**
 * 
 * @author Henri Lopes Schons
 */

for(int i = 0; i < vetor.lenght; i++){
    String letraInicial = i;
    
    //teoricamente, compara a letra inicial da primeira palavra com a letra inicial das demais
    for(int j = i + 1; j < vetor.lenght; j++){
        if(vetor[j] < vetor[letraInicial]){
            letraInicial = j;
        }
    }
    
    //se a letra inicial armazenada for diferente que a letra inicial da primeira
    //palavra ele organiza em ordem alfabetica
    if(letraInicial != i){
        String temp = vetor[letraInicial];
        vetor[letraInicial] = vetor[i];
        vetor[i] = temp;
    }
}

/**
 * Resposta da pergunta:
 * Nomes nao podem ser comparados por operadores matematicos, pois sao tratdos como Strings e não
 * como numeros, e os operadores logicos matematicos funcionam apenas para numeros.
 */