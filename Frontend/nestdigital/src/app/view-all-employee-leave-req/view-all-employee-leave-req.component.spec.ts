import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllEmployeeLeaveReqComponent } from './view-all-employee-leave-req.component';

describe('ViewAllEmployeeLeaveReqComponent', () => {
  let component: ViewAllEmployeeLeaveReqComponent;
  let fixture: ComponentFixture<ViewAllEmployeeLeaveReqComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewAllEmployeeLeaveReqComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewAllEmployeeLeaveReqComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
