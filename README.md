# Boas Práticas de Software

Atividade prática de refatoração de código aplicando boas práticas e controle de versão com Git.

## Questões

### 1. Qual era o principal problema do código original?
O código original tinha nomes de variáveis pouco descritivos (n, a, b, c), o que dificultava o entendimento. Além disso, toda a lógica (cálculo, decisão e exibição) estava concentrada dentro do método main, sem divisão de responsabilidades.

### 2. Quais melhorias você realizou?
- Renomeei as variáveis para nomes descritivos: nomeAluno, primeiraNota, segundaNota e mediaFinal.
- Dividi o código em três métodos com responsabilidades específicas: calcularMedia, verificarSituacao e exibirResultado.
- Apliquei código auto comentado, deixando os nomes claros o suficiente para dispensar comentários desnecessários.
- Padronizei os nomes seguindo as convenções do Java (PascalCase para a classe, camelCase para métodos e variáveis).
- Extraí o valor 6 para a constante MEDIA_MINIMA_APROVACAO, eliminando o número mágico.

### 3. Como a modularização facilitou a organização do código?
A modularização fez com que cada parte do sistema tivesse uma única responsabilidade, o que deixa o código mais fácil de entender, testar e manter. Se for preciso mudar a regra da média ou a forma de exibição, altera-se apenas o método responsável, sem afetar o resto do sistema.

### 4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu registrar cada etapa do trabalho de forma rastreável: o código original ficou no primeiro commit, as melhorias em uma branch separada, e o Pull Request documentou o que foi alterado antes de integrar na main. Assim é possível ver o histórico completo, comparar versões e reverter mudanças se necessário.
