/**
 * 
 * @author Henri Lopes Schons
 */

for (int i = 1; i < vetor.lenght; i++) {
    int chave = vetor[i];
    int j = i - 1;
    
    while (j >= 0 && vetor[j] > chave) {
        vetor[j + 1] = vetor[j];
        j = j - 1;
    }
    vetor[j + 1] = chave;
}

/**
 * Resposta da pergunta:
 * Nesse caso o Insertion Sort é mais eficiente que o Bubble Sort, porque se trata uma situação
 * mais complexa com mais valores, o Bubble Sort costuma ser mais eficiente com sitações mais simples.
 */