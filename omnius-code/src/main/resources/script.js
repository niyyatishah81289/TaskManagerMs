const app = document.getElementById('root');

const container = document.createElement('div');
container.setAttribute('class', 'container');


app.appendChild(container);

var request = new XMLHttpRequest();
request.open('GET', 'http://localhost:8081/v1/getAll', true);
request.onload = function () {

  // Begin accessing JSON data here
  var data = JSON.parse(this.response);
  if (request.status >= 200 && request.status < 400) {
    data.forEach(task => {
      const card = document.createElement('div');
      card.setAttribute('class', 'card');

      const h1 = document.createElement('h1');
      h1.textContent = task.taskId;

      const pTtile = document.createElement('p');
      pTtile.textContent = "Title::" +` ${task.title}`;
	  
	 const pDescription = document.createElement('p');
      pDescription.textContent = "Description ::" + `${task.description} ` ;
	  
	  const pDueDate = document.createElement('p');
      pDueDate.textContent = "Due Date::" + ` ${task.dueDate}`;
	  
	  const pPriority = document.createElement('p');
      pPriority.textContent = "Priority::" + ` ${task.priority}`;

      container.appendChild(card);
      card.appendChild(h1);
      card.appendChild(pTtile);
	  card.appendChild(pDescription);
	  card.appendChild(pDueDate);
	  card.appendChild(pPriority);
	  
    });
  } else {
    const errorMessage = document.createElement('marquee');
    errorMessage.textContent = `Gah, it's not working!`;
    app.appendChild(errorMessage);
  }
}

request.send();