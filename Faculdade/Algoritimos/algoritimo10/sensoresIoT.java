/**
 * 
 * @author Henri Lopes Schons
 */

for(int i = vetor.lenght - 1; i >= 0; i--){

    if(vetor[i] > vetor[i - 1]){
        int temp = vetor[i];
        vetor[i] = vetor[i - 1];
        vetor[i - 1] = temp;
    }
}

/**
 * Resposta da pergunta:
 * O loop interno diminui seu tamanho ao longo das rodadas pois parte do vetor ja foi organizado,
 * logo por ja estar em ordem nao tem necessidade de uma nova verificação.
 */