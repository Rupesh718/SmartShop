import { TestBed } from '@angular/core/testing';

import { AngproductService } from './angproduct.service';

describe('AngproductService', () => {
  let service: AngproductService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AngproductService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
