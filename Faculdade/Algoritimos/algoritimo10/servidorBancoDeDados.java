/**
 * 
 * @author Henri Lopes Schons
 */


while (j >= 0) {
    vetor[j + 1] = vetor[j];
    j = j - 1;
}
vetor[j + 1] = chave;

/**
 * Resposta da pergunta:
 * O limite matematico garante que nenhum indice negativo será utilizado, ja que não é possivel
 * ter indices negativos, logo só será utilzado para a operação os indices positivos.
 */