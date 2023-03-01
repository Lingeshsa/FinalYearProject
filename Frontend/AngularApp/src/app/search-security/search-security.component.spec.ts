import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchSecurityComponent } from './search-security.component';

describe('SearchSecurityComponent', () => {
  let component: SearchSecurityComponent;
  let fixture: ComponentFixture<SearchSecurityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchSecurityComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchSecurityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
