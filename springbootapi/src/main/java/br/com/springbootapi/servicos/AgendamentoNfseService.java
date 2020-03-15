package br.com.springbootapi.servicos;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.springbootapi.entity.Pessoa;
import br.com.springbootapi.repository.PessoaRepository;

@Component
@EnableScheduling
public class AgendamentoNfseService {
	
	//https://www.alura.com.br/artigos/agendando-tarefas-com-scheduled-do-spring

	private static final String TIME_ZONE = "America/Sao_Paulo";
	private final long SEGUNDO = 1000;
	private final long MINUTO = SEGUNDO * 60;

	@Autowired
	private PessoaRepository _pessoaRepository;

	// Padrão linux de agendamento
	// A B C D E F
	// A: Segundos (0 - 59).
	// B: Minutos (0 - 59).
	// C: Horas (0 - 23).
	// D: Dia (1 - 31).
	// E: Mês (1 - 12).
	// F: Dia da semana (0 - 6).

	// @Scheduled(cron = "0 0 6 * * *", zone = TIME_ZONE)
//	@Scheduled(fixedDelay = MINUTO, zone = TIME_ZONE)
	public void metodo() {
		System.out.println("Rotina Agendada " + new Date());
//		List<Pessoa> lista =this._pessoaRepository.findAll();		
//		for (Pessoa pessoa : lista) {
//			System.out.println(pessoa.toString());
//		}
	}

}
