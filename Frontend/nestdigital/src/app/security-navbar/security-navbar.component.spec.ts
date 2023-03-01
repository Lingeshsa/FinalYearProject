import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecurityNavbarComponent } from './security-navbar.component';

describe('SecurityNavbarComponent', () => {
  let component: SecurityNavbarComponent;
  let fixture: ComponentFixture<SecurityNavbarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SecurityNavbarComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SecurityNavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
