/**
 * 
 * @author Henri Lopes Schons
 */

for(int i = 0; i < vetor.lenght; i++){
    int minimo = i;
    
    for(int j = i + 1; j < vetor.lenght; j++){
        if(vetor[j] < vetor[minimo]){
            minimo = j;
        }
    }
    
    if(minimo != i){
        int temp = vetor[minimo];
        vetor[minimo] = vetor[i];
        vetor[i] = temp;
    }
}


/**
 * Resposta da pergunta:
 * A variável "temp" por ser uma variável temporaria, ao sair do loop em que ela está declarada
 * ela deixa de existir.
 */