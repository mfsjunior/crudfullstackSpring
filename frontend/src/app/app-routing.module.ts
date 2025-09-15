import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PessoasComponent } from './pessoas/pessoas.component';

const routes: Routes = [
  { path: 'pessoas', component: PessoasComponent },
  { path: '', redirectTo: 'pessoas', pathMatch: 'full' }, // opcional: rota padrão
  { path: '**', redirectTo: '' } // opcional: fallback
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }