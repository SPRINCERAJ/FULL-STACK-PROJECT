import { User } from './user';

describe('User', () => {
  it('should create an instance', () => {
    const user = new User('1', 'test@example.com', 'password123', true);
    expect(user).toBeTruthy();
    expect(user.userid).toEqual('1');
    expect(user.emailid).toEqual('test@example.com');
    expect(user.password).toEqual('password123');
    expect(user.loginstatus).toEqual(true);
  });
});
