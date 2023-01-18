import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagerproductsComponent } from './managerproducts.component';

describe('ManagerproductsComponent', () => {
  let component: ManagerproductsComponent;
  let fixture: ComponentFixture<ManagerproductsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ManagerproductsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ManagerproductsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
