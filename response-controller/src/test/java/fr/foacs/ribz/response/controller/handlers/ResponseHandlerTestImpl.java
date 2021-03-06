/*
 * Copyright or © or Copr. Foacs
 * contributor(s):
 *  - Alexis DINQUER adinquer@yahoo.com
 *  - Brice KESSLER brice.kessler@outlook.com
 *
 * This software is a computer program whose purpose is to develop and
 * play board game.
 *
 * This software is governed by the CeCILL license under French law and
 * abiding by the rules of distribution of free software. You can use,
 * modify and/ or redistribute the software under the terms of the CeCILL
 * license as circulated by CEA, CNRS and INRIA at the following URL
 * "http://www.cecill.info".
 *
 * As a counterpart to the access to the source code and rights to copy,
 * modify and redistribute granted by the license, users are provided only
 * with a limited warranty and the software's author, the holder of the
 * economic rights, and the successive licensors have only limited
 * liability.
 *
 * In this respect, the user's attention is drawn to the risks associated
 * with loading, using, modifying and/or developing or reproducing the
 * software by the user in light of its specific status of free software,
 * that may mean that it is complicated to manipulate, and that also
 * therefore means that it is reserved for developers and experienced
 * professionals having in-depth computer knowledge. Users are therefore
 * encourage to load and test the software's suitability as regards their
 * requirements in conditions enabling the security of their systems and/or
 * data to be ensured and, more generally, to use and operate it in the
 * same conditions as regards security.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL license and that you accept its terms.
 */

package fr.foacs.ribz.response.controller.handlers;

import fr.foacs.ribz.core.event.handler.HandleMessage;
import fr.foacs.ribz.response.controller.responses.ResponseTestImpl;
import lombok.Getter;
import lombok.Setter;
import javax.annotation.Nonnull;

/**
 * Test implementation for {@link ResponseHandler} class.
 *
 * @since 0.1
 */
@HandleMessage(ResponseTestImpl.class)
public class ResponseHandlerTestImpl extends ResponseHandler<ResponseTestImpl> {

  @Getter
  @Setter
  private static boolean called = false;

  /**
   * Constructs a handler with the class of handled type.
   */
  public ResponseHandlerTestImpl() {
    super(ResponseTestImpl.class);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  protected void handle(@Nonnull ResponseTestImpl event) {
    ResponseHandlerTestImpl.called = true;
  }
}
