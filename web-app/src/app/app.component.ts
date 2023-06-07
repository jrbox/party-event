import { Component, OnInit, inject } from '@angular/core';
import { PartyEventService } from './party-event.service';
import { PartyEvent } from './party-event.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {
  private partyEventService: PartyEventService = inject(PartyEventService);

  title = 'Aucun événement pour le moment';

  // liste des événements
  partyEvents: PartyEvent[] = [];

  ngOnInit(): void {
    this.partyEventService.findAll().subscribe((partyEvents) => {
      this.partyEvents = partyEvents;
      this.title = partyEvents?.length ? "Evénements" : "Aucun événement pour le moment";
    });
  }
}
