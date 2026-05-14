/**
 * 
 * @author Henri Lopes Schons
 */

boolean organizado = false;
while(organizado == false){

    for(int i = vetor.lenght - 1; i >= 0; i--){

        if(vetor[i] > vetor[i - 1]){
        int temp = vetor[i];
        vetor[i] = vetor[i - 1];
        vetor[i - 1] = temp;
        }
    }

    organizado = true;
}


/**
 * Resposta da pergunta:
 * A variavel boolean ajuda a aliviar a CPU porque ela evita verificações e repetições desnecessárias
 * dentro do algoritmo, ja que o boolean pode verificar mais facilmente.
 */