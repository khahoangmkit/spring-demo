const express = require('express')
const app = express()
const port = 3000
const cors = require('cors');

app.use(cors({origin: true}));

const data = [
  {
    name: 'hoangdk',
    age: 14
  },
  {
    name: 'hoangdk1',
    age: 23
  },
  {
    name: 'hoangdk2',
    age: 19
  },
  {
    name: 'hoangdk3',
    age: 24
  }
]
USER_NAME = process.env.USER_NAME
app.get('/', (req, res) => {
  res.send({
   code: 200,
   data: data
  });
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})
