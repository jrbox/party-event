import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-event-card',
  templateUrl: './event-card.component.html',
  styleUrls: ['./event-card.component.scss']
})
export class EventCardComponent {

  @Input() title: string = 'titre';
  @Input() subtitle: string = 'sous-titre';
  @Input() description: string = 'description';
}
