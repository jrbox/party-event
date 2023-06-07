import { HttpClient } from '@angular/common/http';
import { Injectable, inject } from '@angular/core';
import { Observable, of } from 'rxjs';
import { environment } from 'src/environments/environment';
import { PartyEvent } from './party-event.model';

@Injectable({
  providedIn: 'root',
})
export class PartyEventService {
  private http: HttpClient = inject(HttpClient);

  private partyEvents: PartyEvent[] = [
    {
      id: 1,
      name: 'Match France - Portugal',
      description:
        "Venez supporter l'équipe de france pour la final de la coupe du monde.",
      capacity: 100,
      startDate: new Date(2023, 5, 22),
      endDate: new Date(),
    },
    {
      id: 2,
      name: 'Concert 80',
      description:
        "Super concert des années 80 pour tout le monde sans limite d'age.",
      capacity: 2500,
      startDate: new Date(2023, 8, 13),
      endDate: new Date(2023, 8, 15),
    },
    {
      id: 3,
      name: 'Braderie de lille 2023',
      description:
        "Participez à la plus grande braderie d'europe du vendredi au dimanche.",
      capacity: 999999,
      startDate: new Date(2023, 8, 6),
      endDate: new Date(),
    },
    {
      id: 4,
      name: 'Conférence Killian',
      description: 'Conférence international sur PHP :)',
      capacity: 25000,
      startDate: new Date(2023, 11, 31),
      endDate: new Date(2023, 11, 31),
    },
  ];

  constructor() {}

  /**
   * Recherche tous les evenements
   * @returns {Observable<PartyEvent[]>}
   */
  findAll(): Observable<PartyEvent[]> {
    if (environment.production) {
      return this.http.get<PartyEvent[]>(environment.apiUrl + '/party-events');
    } else {
      return of(this.partyEvents);
    }
  }
}
