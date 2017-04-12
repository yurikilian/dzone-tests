## Curso de Qualidade de Sofwtare
### Testes da página dzone.com

#### Funcionalidades:
	- Fazer cadastro
		- Cenário: Efetuando cadastro do usuário no site
		- Dado os dados obrigatórios da pessoa que são: Nome, Sobrenome, Senha, Confirmação de Senha, Empresa, Cargo, Rua, País, Cidade, CEP e telefone
		- Quando clicar em Sign In / Join e preencher os campos obrigatórios do formulário
		- Então o site deve apresentar a seguinte mensagem de cadastro com sucesso no centro da página: Thank you for joining DZone.com!

	- Efetuar Login
		- Cenário: Efetuando login do usuário no site
		- Dado o email e a senha do usuário corretos
		- Quando clicar em Sign In / Join e preencher o email e a senha
		- Então o site deve apresentar a mensagem de login efetuado com sucesso no cabeçalho da página

	- Validar Login
		- Cenário: Validando os dados informados pelo usuário para login
		- Dado um email e uma senha inválida
		- Quando clicar em Sign In / Join e preencher o email e a senha
		- Então o site deve apresentar os dois campos de entrada sombreados de vermelho sem nenhuma mensagem

	- Efetuar pesquisa
		- Cenário: Efetuando uma pesquisa
		- Dado o nome de um artigo do site
		- Quando clicar na lupa superior direita do site e inserir o nome do artigo
		- Então o site deve apresentar o resultado específico que pode ser acessível

	- Assinar newsletter
		- Cenário: Cadastrando email na newsletter
		- Dado um endereco de email válido
		- Quando informar email no campo de newsletter no rodapé da página
		- Então o site deve apresentar a mensagem Thanks for subscribing! indicando o sucesso da operação