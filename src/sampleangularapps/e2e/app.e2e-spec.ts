import { SampleangularappsPage } from './app.po';

describe('sampleangularapps App', function() {
  let page: SampleangularappsPage;

  beforeEach(() => {
    page = new SampleangularappsPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
