import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeLeaveApplyComponent } from './employee-leave-apply.component';

describe('EmployeeLeaveApplyComponent', () => {
  let component: EmployeeLeaveApplyComponent;
  let fixture: ComponentFixture<EmployeeLeaveApplyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EmployeeLeaveApplyComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EmployeeLeaveApplyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
