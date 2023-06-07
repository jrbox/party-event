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

  // liste des événements
  partyEvents: PartyEvent[] = [];

  ngOnInit(): void {
    this.partyEventService.findAll().subscribe((partyEvents) => {
      this.partyEvents = partyEvents;
    });
  }
}
