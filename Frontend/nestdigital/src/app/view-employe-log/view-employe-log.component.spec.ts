import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewEmployeLogComponent } from './view-employe-log.component';

describe('ViewEmployeLogComponent', () => {
  let component: ViewEmployeLogComponent;
  let fixture: ComponentFixture<ViewEmployeLogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewEmployeLogComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewEmployeLogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
