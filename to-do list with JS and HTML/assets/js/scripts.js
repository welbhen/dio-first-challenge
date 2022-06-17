const newItemHTML = document.getElementById('inputField');
const listHTML = document.getElementById('list');

const addNewItem = () => {
    const newItem = newItemHTML.value;
    if(newItem){
        const current = listHTML.innerHTML;
        listHTML.innerHTML = `${current}
                            
                            <div class="list-item">
                                <input type="checkbox" class="checkbox-item">
                                <span>${newItem}</span>
                            </div>`;
    }
}