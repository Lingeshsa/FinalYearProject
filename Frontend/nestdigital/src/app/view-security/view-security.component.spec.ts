import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewSecurityComponent } from './view-security.component';

describe('ViewSecurityComponent', () => {
  let component: ViewSecurityComponent;
  let fixture: ComponentFixture<ViewSecurityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewSecurityComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewSecurityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
