import { Component, OnInit } from '@angular/core';
import { PessoasService, Pessoa } from '../pessoas.service';

@Component({
  selector: 'pessoas',
  templateUrl: './pessoas.component.html',
  styleUrls: ['./pessoas.component.css']
})
export class PessoasComponent implements OnInit {
  pessoas: Pessoa[] = [];
  loading = false;
  error = '';

  constructor(private service: PessoasService) {}

  ngOnInit(): void {
    this.load();
  }

  load() {
    this.loading = true;
    this.service.listar().subscribe({
      next: data => { this.pessoas = data; this.loading = false; },
      error: () => { this.error = 'Falha ao carregar pessoas'; this.loading = false; }
    });
  }
}
