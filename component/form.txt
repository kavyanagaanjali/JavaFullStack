export function Form() {
  return (
    <div>
      <h1 style={{ textAlign: "center" }}>REGISTRATION FORM</h1><br /><br />
      <form>
        <fieldset>
          <label>Name</label>
          <input type="text" name="name" /><br /><br />

          <label>Date Of Birth</label>
          <input type="datetime-local" name="dob" /><br /><br />

          <label>Age</label>
          <input type="number" name="age" /><br /><br />

          <label>Gender</label><br />
          <label><input type="radio" name="gender" value="male" /> Male</label>
          <label><input type="radio" name="gender" value="female" /> Female</label>
          <label><input type="radio" name="gender" value="others" /> Others</label><br /><br />

          <label>
            Email Id<span style={{ color: 'orange' }}>*</span>:
          </label>
          <input type="email" name="email" required autoFocus /><br /><br />

          <label>
            Password<span style={{ color: 'orange' }}>*</span>:
          </label>
          <input type="password" name="password" placeholder="Enter password" required /><br /><br />

          <label>Mobile Number</label>
          <input type="number" name="mobile" /><br /><br />

          <input type="submit" />
        </fieldset>
      </form>
    </div>
  );
}

