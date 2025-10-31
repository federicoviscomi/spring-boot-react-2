import { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState<string>('');

  useEffect(() => {
    fetch('/api/hello')
      .then(res => res.text())
      .then(setMessage);
  }, []);

  return (
    <div style={{ padding: 20 }}>
      <h1>React + Vite + TypeScript + Spring Boot</h1>
      <p>API says: {message}</p>
    </div>
  );
}

export default App;
