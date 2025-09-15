import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Pessoa { id?: string; nome: string; idade: number; }

@Injectable({ providedIn: 'root' })
export class PessoasService {
  private api = '/api/pessoas'; // nginx proxy: /api -> backend

  constructor(private http: HttpClient) {}

  listar(): Observable<Pessoa[]> {
    return this.http.get<Pessoa[]>(this.api);
  }
}